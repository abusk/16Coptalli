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
var LayoutComponent = (function () {
    /*  onClickMe(event){
         alert("clicked "+event.x +" "+event.y);
      }*/
    function LayoutComponent() {
    }
    LayoutComponent.prototype.ngOnInit = function () {
    };
    LayoutComponent.prototype.ngAfterViewInit = function () {
        var ctx = this.canvas.nativeElement.getContext("2d");
        ctx.lineWidth = 3;
        var x1 = 50;
        var y1 = 150;
        var x2 = 500;
        var y2 = 600;
        //Mid line
        for (var i = x1; i <= x2; i = i + (x2 - x1) / 4) {
            ctx.moveTo(i, y1);
            ctx.lineTo(i, y2);
            ctx.stroke();
        }
        for (var i = y1; i <= y2; i = i + (x2 - x1) / 4) {
            ctx.moveTo(x1, i);
            ctx.lineTo(x2, i);
            ctx.stroke();
        }
        //Mid line end
        //Diagonal begin
        ctx.moveTo(x1, y1);
        ctx.lineTo(x2, y2);
        ctx.stroke();
        ctx.moveTo(x2, y1);
        ctx.lineTo(x1, y2);
        ctx.stroke();
        //Diagonal end
        //inner square 
        ctx.moveTo(x1 + (x2 - x1) / 2, y1);
        ctx.lineTo(x1, y1 + (y2 - y1) / 2);
        ctx.stroke();
        ctx.moveTo(x1, y1 + (y2 - y1) / 2);
        ctx.lineTo(x1 + (x2 - x1) / 2, y2);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 2, y2);
        ctx.lineTo(x2, y1 + (y2 - y1) / 2);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 2, y1);
        ctx.lineTo(x2, y1 + (y2 - y1) / 2);
        ctx.stroke();
        //innersquare end
        //upper tails begin
        ctx.moveTo(x1 + (x2 - x1) / 4, y1 - (y2 - y1) / 4);
        ctx.lineTo(x1 + (x2 - x1) / 2, y1);
        ctx.stroke();
        ctx.moveTo(x1 + 3 * (x2 - x1) / 4, y1 - (y2 - y1) / 4);
        ctx.lineTo(x1 + (x2 - x1) / 2, y1);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 4, y1 - (y2 - y1) / 4);
        ctx.lineTo(x1 + 3 * (x2 - x1) / 4, y1 - (y2 - y1) / 4);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 2, y1);
        ctx.lineTo(x1 + (x2 - x1) / 2, y1 - (y2 - y1) / 4);
        ctx.stroke();
        ctx.moveTo((5 * x1 + 3 * x2) / 8, (9 * y1 - y2) / 8);
        ctx.lineTo((3 * x1 + 5 * x2) / 8, (9 * y1 - y2) / 8);
        ctx.stroke();
        //tails end
        //lower tails begin
        ctx.moveTo(x1 + (x2 - x1) / 4, y2 + (y2 - y1) / 4);
        ctx.lineTo(x1 + (x2 - x1) / 2, y2);
        ctx.stroke();
        ctx.moveTo(x1 + 3 * (x2 - x1) / 4, y2 + (y2 - y1) / 4);
        ctx.lineTo(x1 + (x2 - x1) / 2, y2);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 4, y2 + (y2 - y1) / 4);
        ctx.lineTo(x1 + 3 * (x2 - x1) / 4, y2 + (y2 - y1) / 4);
        ctx.stroke();
        ctx.moveTo(x1 + (x2 - x1) / 2, y2);
        ctx.lineTo(x1 + (x2 - x1) / 2, y2 + (y2 - y1) / 4);
        ctx.stroke();
        ctx.moveTo((5 * x1 + 3 * x2) / 8, (9 * y2 - y1) / 8);
        ctx.lineTo((3 * x1 + 5 * x2) / 8, (9 * y2 - y1) / 8);
        ctx.stroke();
        //tails end
    };
    return LayoutComponent;
}());
__decorate([
    core_1.ViewChild('myCanvas'),
    __metadata("design:type", core_1.ElementRef)
], LayoutComponent.prototype, "canvas", void 0);
LayoutComponent = __decorate([
    core_1.Component({
        selector: 'app-layout',
        template: "<div>\n      <canvas #myCanvas id=\"myCanvas\" width=\"600\" height=\"750\" style=\"border:1px solid #d3d3d3;\">\n          Your browser does not support the HTML5 canvas tag.</canvas>\n  </div>",
    }),
    __metadata("design:paramtypes", [])
], LayoutComponent);
exports.LayoutComponent = LayoutComponent;
//# sourceMappingURL=layout.component.js.map