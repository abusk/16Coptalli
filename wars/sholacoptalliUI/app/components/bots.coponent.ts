/**
 * Created by taleb on 6/19/17.
 */
import { Component } from '@angular/core';
import { Router } from '@angular/router'
@Component({
    selector: 'app-bots',
    template :`<div>
        <h1>BOTS</h1>
    </div>`,
})
export class BotsComponent {
    constructor(private router: Router) {

    }
}