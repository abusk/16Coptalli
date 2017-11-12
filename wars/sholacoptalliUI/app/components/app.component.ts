import { Component } from '@angular/core';
import { Router } from '@angular/router'
@Component({
    selector: 'app-root',
    template :`
    <div class="container-fluid">
        <!-- Stack the columns on mobile by making one full-width and the other half-width -->
        <div class="row">
            <nav class="navbar navbar-default navbar-fixed-top">
                <h1>{{title}}</h1>
            </nav>
            <div class="row">
                <div class="col-xs-6 col-md-4">
                    <div class="fixPosition menuBorder" style="height: 100%;width: 217px;top: 50px;background-color: #CCCCCC;">
                        <ul class="nav nav-sidebar">
                            <li class="active"><a [routerLink]="['/coptalli']">Home<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-home"></span></a></li>
                        </ul>
                        <ul class="nav nav-sidebar">
                            <li class="active"><a class="list-group-item" data-toggle="collapse" href="#collapseUser">User<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-user"></span></a></li>
                            <ul class="collapse" id="collapseUser">
                                <li class="active"><a href="#">User Info<span style="font-size:10px;"></span></a></li>
                                <li class="active"><a href="#">Logout<span style="font-size:10px;"></span></a></li>
                            </ul>
                        </ul>
                        <ul class="nav nav-sidebar">
                            <li class="active"><a class="list-group-item" data-toggle="collapse" href="#collapseLevel">Level<span style="font-size:16px;" class="pull-right hidden-xs showopacity glyphicon glyphicon-stats"></span></a></li>
                            <ul class="collapse" id="collapseLevel">
                                <li class="active"><a href="#">Easy<span style="font-size:10px;"></span></a></li>
                                <li class="active"><a href="#">Intermediate<span style="font-size:10px;"></span></a></li>
                                <li class="active"><a href="#">Difficult<span style="font-size:10px;"></span></a></li>
                                <li class="active"><a href="#">Expert<span style="font-size:10px;"></span></a></li>
                            </ul>
                        </ul>
                    </div>
                </div>
                <div class="col-xs-6 col-md-4">
                    <router-outlet></router-outlet>                
                </div>
            </div>
            <div class="col-xs-6 col-md-4"></div>
        </div>
    </div>`,
})
export class AppComponent {
    title : string = "SholaCoptalli";
    constructor(private router: Router) {
    }
}
