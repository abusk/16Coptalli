import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import {AppRouter} from "./app.router";

import { AppComponent } from './components/app.component';
import { LayoutComponent } from './components/layout.component';
import { HomeComponent } from './components/home.component';
import { BotsComponent } from './components/bots.coponent';
import { PlayerComponent } from './components/player.component';
import {PlayBoardComponent } from './components/playboard.component';

@NgModule({
  declarations: [
    AppComponent,
    LayoutComponent,
    HomeComponent,
    BotsComponent,
    PlayerComponent,
      PlayBoardComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,AppRouter
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
