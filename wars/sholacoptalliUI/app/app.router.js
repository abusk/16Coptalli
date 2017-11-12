"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var router_1 = require("@angular/router");
var home_component_1 = require("./components/home.component");
var playboard_component_1 = require("./components/playboard.component");
var appRoutes = [
    {
        path: 'coptalli',
        children: [
            { path: '', component: home_component_1.HomeComponent },
            { path: 'board', component: playboard_component_1.PlayBoardComponent },
        ]
    }
];
exports.AppRouter = router_1.RouterModule.forRoot(appRoutes);
//# sourceMappingURL=app.router.js.map