/**
 * Created by taleb on 6/19/17.
 */
import { Component } from '@angular/core';
import { Router } from '@angular/router'
@Component({
    selector: 'app-player',
    template :`<div>
        <h1>Players</h1>
        <button type="button" class="btn btn-primary">Create Game</button>
        <button type="button" class="btn btn-success">Join Game</button>
    </div>`,
})
export class PlayerComponent {
    constructor(private router: Router) {

    }
}