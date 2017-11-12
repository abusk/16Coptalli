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
var core_1 = require("@angular/core");
var router_1 = require("@angular/router");
var AppComponent = (function () {
    function AppComponent(router) {
        this.router = router;
        this.title = "SholaCoptalli";
    }
    return AppComponent;
}());
AppComponent = __decorate([
    core_1.Component({
        selector: 'app-root',
        template: "\n    <div class=\"container-fluid\">\n        <!-- Stack the columns on mobile by making one full-width and the other half-width -->\n        <div class=\"row\">\n            <nav class=\"navbar navbar-default navbar-fixed-top\">\n                <h1>{{title}}</h1>\n            </nav>\n            <div class=\"row\">\n                <div class=\"col-xs-6 col-md-4\">\n                    <div class=\"fixPosition menuBorder\" style=\"height: 100%;width: 217px;top: 50px;background-color: #CCCCCC;\">\n                        <ul class=\"nav nav-sidebar\">\n                            <li class=\"active\"><a [routerLink]=\"['/coptalli']\">Home<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-home\"></span></a></li>\n                        </ul>\n                        <ul class=\"nav nav-sidebar\">\n                            <li class=\"active\"><a class=\"list-group-item\" data-toggle=\"collapse\" href=\"#collapseUser\">User<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-user\"></span></a></li>\n                            <ul class=\"collapse\" id=\"collapseUser\">\n                                <li class=\"active\"><a href=\"#\">User Info<span style=\"font-size:10px;\"></span></a></li>\n                                <li class=\"active\"><a href=\"#\">Logout<span style=\"font-size:10px;\"></span></a></li>\n                            </ul>\n                        </ul>\n                        <ul class=\"nav nav-sidebar\">\n                            <li class=\"active\"><a class=\"list-group-item\" data-toggle=\"collapse\" href=\"#collapseLevel\">Level<span style=\"font-size:16px;\" class=\"pull-right hidden-xs showopacity glyphicon glyphicon-stats\"></span></a></li>\n                            <ul class=\"collapse\" id=\"collapseLevel\">\n                                <li class=\"active\"><a href=\"#\">Easy<span style=\"font-size:10px;\"></span></a></li>\n                                <li class=\"active\"><a href=\"#\">Intermediate<span style=\"font-size:10px;\"></span></a></li>\n                                <li class=\"active\"><a href=\"#\">Difficult<span style=\"font-size:10px;\"></span></a></li>\n                                <li class=\"active\"><a href=\"#\">Expert<span style=\"font-size:10px;\"></span></a></li>\n                            </ul>\n                        </ul>\n                    </div>\n                </div>\n                <div class=\"col-xs-6 col-md-4\">\n                    <router-outlet></router-outlet>                \n                </div>\n            </div>\n            <div class=\"col-xs-6 col-md-4\"></div>\n        </div>\n    </div>",
    }),
    __metadata("design:paramtypes", [router_1.Router])
], AppComponent);
exports.AppComponent = AppComponent;
//# sourceMappingURL=app.component.js.map