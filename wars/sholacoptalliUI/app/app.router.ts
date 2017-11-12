import {ModuleWithProviders} from "@angular/core";
import {Routes, RouterModule} from "@angular/router";
import { HomeComponent } from './components/home.component';
import { BotsComponent } from './components/bots.coponent';
import { PlayerComponent } from './components/player.component';
import {PlayBoardComponent}from './components/playboard.component';
const appRoutes: Routes = [
    {
        path: 'coptalli',
        children: [
            {path: '', component: HomeComponent},
            {path : 'board', component:PlayBoardComponent},
        ]
    }
]

export const AppRouter: ModuleWithProviders = RouterModule.forRoot(appRoutes);
