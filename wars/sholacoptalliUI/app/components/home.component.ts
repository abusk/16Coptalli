/**
 * Created by taleb on 6/18/17.
 */
import { Component } from '@angular/core';
import { Router } from '@angular/router'
import {Http, Headers, RequestOptions, Response} from "@angular/http";
import {Observable} from "rxjs";
declare var swal: any;

@Component({
    selector: 'app-home',
    template :`<div>
        <h1>Welcome to SholaCoptalli</h1>
        <nav class="navbar navbar-toggleable-md navbar-light bg-faded">
            <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div class="navbar-nav">
                    <button type="button" class="btn btn-primary" (click)="isComuter()">Play with Computer</button>
                    <button type="button" class="btn btn-primary" (click)="isHuman()">Play with Human</button>
                </div>
            </div>
        </nav>
        <div class="container" style="width:436px;">
            <table class="table table-hover" *ngIf="playerSelected == 'human' ">
                <tbody>
                <tr>
                    <td ><button type="button" class="btn btn-link" (click)="subscribeCreateGame()">Create Game</button></td>
                </tr>
                <tr>
                    <td><button type="button" class="btn btn-link" [disabled] = "enableJoinGame" (click)="joinGameClicked()">Join Game</button></td>
                </tr>
                <tr *ngIf="joinGameSelected">
                    <td>
                        <input type="text" class="form-control" [(ngModel)]="gameId" placeholder="Enter game Id here"><br/>
                        <button type="button" class="btn btn-primary" (click)="subscribeJoinGame()">Submit</button>
                    </td>
                </tr>
                </tbody>
            </table>
            <table class="table table-hover" *ngIf="playerSelected == 'computer' ">
                <tbody>
                <tr>
                    <td><button type="button" class="btn btn-link">Easy</button></td>
                </tr>
                <tr>
                    <td><button type="button" class="btn btn-link">Intermediate</button></td>
                </tr>
                <tr>
                    <td><button type="button" class="btn btn-link">Difficult</button></td>
                </tr>
                <tr>
                    <td><button type="button" class="btn btn-link">Expert</button></td>
                </tr>
                </tbody>
            </table>

            <div *ngIf="gameState == 1">
                <button type="button" class="btn btn-primary" (click)="redirectToBoard()">Play</button>
            </div>
        </div>
    </div>`,
})
export class HomeComponent {
    private playerSelected : string = "";
    private enableJoinGame : boolean = false;
    private joinGameSelected : boolean = false;
    private gameId : string ="";
    private gameState : number = -1;
    constructor(private router: Router, private http : Http) {
    }

    isComuter() {
        this.playerSelected = "computer";
        this.joinGameSelected = false;
        this.enableJoinGame = false;
    }
    isHuman() {
        this.playerSelected = "human";
        this.joinGameSelected = false;
        this.enableJoinGame = false;
    }
    joinGameClicked () {
        this.joinGameSelected = true;
    }
    subscribeCreateGame(userId : string) {
        this.enableJoinGame = true;
        this.createGame("abu24").subscribe(info => {
            alert(info);
            this.gameId = info;
            this.startPolling();
            },
            error => {
                alert(error.toString())
            });
    }
    subscribeJoinGame(userId : string) {
        this.joinGame("taleb12").subscribe(info => {
                alert(info);
                this.startPolling();
            },
            error => {
                alert(error.toString())
            });
    }
    createGame(userid : string) : Observable<string> {
        let url = window.location.origin + "/coptalli/rest/createGame/" + userid;
        let headers = new Headers({'Content-Type': 'application/json'});
        let options = new RequestOptions({headers: headers});
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    }
    joinGame(userid : string) : Observable<string> {
        let url = window.location.origin + "/coptalli/rest/joinGame/" +this.gameId + "/"+ userid;
        let headers = new Headers({'Content-Type': 'application/json'});
        let options = new RequestOptions({headers: headers});
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    }

    state() : Observable<number> {
        let url = window.location.origin + "/coptalli/rest/state/" +this.gameId;
        let headers = new Headers({'Content-Type': 'application/json'});
        let options = new RequestOptions({headers: headers});
        return this.http.get(url, options).map(this.extractResource).catch(this.handleError);
    }

    intervar : any;
    startPolling() {
        this.state().subscribe(info =>{
            this.gameState = info;
            console.log("game sate",this.gameState);
            clearTimeout(this.intervar);
            this.intervar = null;
            if(this.gameState != 1){
                this.intervar = setTimeout(() => {
                    this.startPolling(); }, 3000);
             }

            },
            error => {
                alert(error.toString())
            }
        );
    }
    extractResource(response : Response ) {
        return response.text();
    }

    handleError(error: any) {
        let errMsg = (error.message) ? error.message :
            error.status ? `${error.status} - ${error.statusText}` : 'Server error';
        console.error(errMsg);
        return Observable.throw(error);
    }

    redirectToBoard(){
        this.router.navigate(['coptalli/board'])
    }

}
