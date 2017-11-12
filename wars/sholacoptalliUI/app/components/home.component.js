"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
Object.defineProperty(exports, "__esModule", { value: true });
/**
 * Created by taleb on 6/18/17.
 */
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var http_1 = require("@angular/http");
var rxjs_1 = require("rxjs");
var HomeComponent = (function () {
    function HomeComponent(router, http) {
        this.router = router;
        this.http = http;
        this.playerSelected = "";
        this.enableJoinGame = false;
        this.joinGameSelected = false;
        this.gameId = "";
        this.gameState = -1;
    }
    HomeComponent.prototype.isComuter = function () {
        this.playerSelected = "computer";
        this.joinGameSelected = false;
        this.enableJoinGame = false;
    };
    HomeComponent.prototype.isHuman = function () {
        this.playerSelected = "human";
        this.joinGameSelected = false;
        this.enableJoinGame = false;
    };
    HomeComponent.prototype.joinGameClicked = function () {
        this.joinGameSelected = true;
    };
    HomeComponent.prototype.subscribeCreateGame = function (userId) {
        var _this = this;
        this.enableJoinGame = true;
        this.createGame("abu24").subscribe(function (info) {
            alert(info);
            _this.gameId = info;
            _this.startPolling();
        }, function (error) {
            alert(error.toString());
        });
    };
    HomeComponent.prototype.subscribeJoinGame = function (userId) {
        var _this = this;
        this.joinGame("taleb12").subscribe(function (info) {
            alert(info);
            _this.startPolling();
        }, function (error) {
            alert(error.toString());
        });
    };
    HomeComponent.prototype.createGame = function (userid) {
        var url = window.location.origin + "/coptalli/rest/createGame/" + userid;
        var headers = new http_1.Headers({ 'Content-Type': 'application/json' });
        var options = new http_1.RequestOptions({ headers: headers });
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    };
    HomeComponent.prototype.joinGame = function (userid) {
        var url = window.location.origin + "/coptalli/rest/joinGame/" + this.gameId + "/" + userid;
        var headers = new http_1.Headers({ 'Content-Type': 'application/json' });
        var options = new http_1.RequestOptions({ headers: headers });
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    };
    HomeComponent.prototype.state = function () {
        var url = window.location.origin + "/coptalli/rest/state/" + this.gameId;
        var headers = new http_1.Headers({ 'Content-Type': 'application/json' });
        var options = new http_1.RequestOptions({ headers: headers });
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    };
    HomeComponent.prototype.startPolling = function () {
        var _this = this;
        this.state().subscribe(function (info) {
            _this.gameState = info;
            console.log("game sate", _this.gameState);
            clearTimeout(_this.intervar);
            _this.intervar = null;
            if (_this.gameState != 1) {
                _this.intervar = setTimeout(function () {
                    _this.startPolling();
                }, 3000);
            }
        }, function (error) {
            alert(error.toString());
        });
    };
    HomeComponent.prototype.extractResource = function (response) {
        return response.text();
    };
    HomeComponent.prototype.handleError = function (error) {
        var errMsg = (error.message) ? error.message :
            error.status ? error.status + " - " + error.statusText : 'Server error';
        console.error(errMsg);
        return rxjs_1.Observable.throw(error);
    };
    HomeComponent.prototype.redirectToBoard = function () {
        this.router.navigate(['coptalli/board']);
    };
    return HomeComponent;
}());
HomeComponent = __decorate([
    core_1.Component({
        selector: 'app-home',
        template: "<div>\n        <h1>Welcome to SholaCoptalli</h1>\n        <nav class=\"navbar navbar-toggleable-md navbar-light bg-faded\">\n            <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\n                <div class=\"navbar-nav\">\n                    <button type=\"button\" class=\"btn btn-primary\" (click)=\"isComuter()\">Play with Computer</button>\n                    <button type=\"button\" class=\"btn btn-primary\" (click)=\"isHuman()\">Play with Human</button>\n                </div>\n            </div>\n        </nav>\n        <div class=\"container\" style=\"width:436px;\">\n            <table class=\"table table-hover\" *ngIf=\"playerSelected == 'human' \">\n                <tbody>\n                <tr>\n                    <td ><button type=\"button\" class=\"btn btn-link\" (click)=\"subscribeCreateGame()\">Create Game</button></td>\n                </tr>\n                <tr>\n                    <td><button type=\"button\" class=\"btn btn-link\" [disabled] = \"enableJoinGame\" (click)=\"joinGameClicked()\">Join Game</button></td>\n                </tr>\n                <tr *ngIf=\"joinGameSelected\">\n                    <td>\n                        <input type=\"text\" class=\"form-control\" [(ngModel)]=\"gameId\" placeholder=\"Enter game Id here\"><br/>\n                        <button type=\"button\" class=\"btn btn-primary\" (click)=\"subscribeJoinGame()\">Submit</button>\n                    </td>\n                </tr>\n                </tbody>\n            </table>\n            <table class=\"table table-hover\" *ngIf=\"playerSelected == 'computer' \">\n                <tbody>\n                <tr>\n                    <td><button type=\"button\" class=\"btn btn-link\">Easy</button></td>\n                </tr>\n                <tr>\n                    <td><button type=\"button\" class=\"btn btn-link\">Intermediate</button></td>\n                </tr>\n                <tr>\n                    <td><button type=\"button\" class=\"btn btn-link\">Difficult</button></td>\n                </tr>\n                <tr>\n                    <td><button type=\"button\" class=\"btn btn-link\">Expert</button></td>\n                </tr>\n                </tbody>\n            </table>\n\n            <div *ngIf=\"gameState == 1\">\n                <button type=\"button\" class=\"btn btn-primary\" (click)=\"redirectToBoard()\">Play</button>\n            </div>\n        </div>\n    </div>",
    }),
    __metadata("design:paramtypes", [router_1.Router, http_1.Http])
], HomeComponent);
exports.HomeComponent = HomeComponent;
//# sourceMappingURL=home.component.js.map