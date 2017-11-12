/**
 * Created by taleb on 7/22/17.
 */
import {Component, ElementRef, ViewChild} from '@angular/core';
import { Router } from '@angular/router'
import {Http, Headers, RequestOptions, Response} from "@angular/http";
import {Observable} from "rxjs";

@Component({
    selector : 'playboard',
            template :`<div >
                <button type="button" class="btn btn-primary" (click)="loadBoard()">Load</button>
                <canvas #myCanvas id="myCanvas" width="600" height="750" style="border:1px solid #d3d3d3;" (click)="getSinglePosition($event)">
                    Your browser does not support the HTML5 canvas tag.</canvas>
            </div>`,

})
export class PlayBoardComponent {
    selectedGuthiX : number = -1;
    selectedGuthiY : number = -1;
    @ViewChild('myCanvas') canvas: ElementRef;
    loadBoard(){

        let ctx: CanvasRenderingContext2D = this.canvas.nativeElement.getContext("2d");

        ctx.lineWidth = 3;

        let x1 = 50;
        let y1 = 150;
        let x2 = 500;
        let y2 = 600;
        //Mid line
        for (var i =x1; i <= x2; i=i+(x2-x1)/4) {
            ctx.moveTo(i, y1);
            ctx.lineTo(i, y2);
            ctx.stroke();
        }
        for (var i = y1; i <= y2; i=i+(x2-x1)/4) {
            ctx.moveTo(x1,i);
            ctx.lineTo(x2,i);
            ctx.stroke();
        }
        //Mid line end

        //Diagonal begin
        ctx.moveTo(x1,y1);
        ctx.lineTo(x2, y2);
        ctx.stroke();

        ctx.moveTo(x2,y1);
        ctx.lineTo(x1, y2);
        ctx.stroke();
        //Diagonal end

        //inner square
        ctx.moveTo(x1+(x2-x1)/2,y1);
        ctx.lineTo(x1, y1+(y2-y1)/2);
        ctx.stroke();

        ctx.moveTo(x1, y1+(y2-y1)/2);
        ctx.lineTo(x1+(x2-x1)/2, y2);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/2,y2);
        ctx.lineTo(x2, y1+(y2-y1)/2);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/2,y1);
        ctx.lineTo(x2, y1+(y2-y1)/2);
        ctx.stroke();
        //innersquare end

        //upper tails begin
        ctx.moveTo(x1+(x2-x1)/4, y1-(y2-y1)/4);
        ctx.lineTo(x1+(x2-x1)/2,y1);
        ctx.stroke();

        ctx.moveTo(x1+3*(x2-x1)/4, y1-(y2-y1)/4);
        ctx.lineTo(x1+(x2-x1)/2,y1);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/4, y1-(y2-y1)/4);
        ctx.lineTo(x1+3*(x2-x1)/4, y1-(y2-y1)/4);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/2,y1);
        ctx.lineTo(x1+(x2-x1)/2, y1-(y2-y1)/4);
        ctx.stroke();

        ctx.moveTo((5*x1+3*x2)/8,(9*y1-y2)/8);
        ctx.lineTo((3*x1+5*x2)/8,(9*y1-y2)/8);
        ctx.stroke();


        //tails end

        //lower tails begin
        ctx.moveTo(x1+(x2-x1)/4, y2+(y2-y1)/4);
        ctx.lineTo(x1+(x2-x1)/2,y2);
        ctx.stroke();

        ctx.moveTo(x1+3*(x2-x1)/4, y2+(y2-y1)/4);
        ctx.lineTo(x1+(x2-x1)/2,y2);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/4, y2+(y2-y1)/4);
        ctx.lineTo(x1+3*(x2-x1)/4, y2+(y2-y1)/4);
        ctx.stroke();

        ctx.moveTo(x1+(x2-x1)/2,y2);
        ctx.lineTo(x1+(x2-x1)/2, y2+(y2-y1)/4);
        ctx.stroke();
        ctx.moveTo((5*x1+3*x2)/8,(9*y2-y1)/8);
        ctx.lineTo((3*x1+5*x2)/8,(9*y2-y1)/8);
        ctx.stroke();
        //tails end
        let img_red = new Image();
        img_red.src="./coptalli/cdn/images/player1.jpg";
        img_red.onload = function(){
            for (var i =x1; i <= x2; i=i+(x2-x1)/4) {
                ctx.drawImage(img_red,i-13,y1-17);
                ctx.drawImage(img_red,i-13,(3*y1+y2)/4 -17);
            }

            ctx.drawImage(img_red,x1+(x2-x1)/4-13, y1-(y2-y1)/4 -17);
            ctx.drawImage(img_red,x1+3*(x2-x1)/4-13, y1-(y2-y1)/4 -17);
            ctx.drawImage(img_red, x1+(x2-x1)/2 -13, y1-(y2-y1)/4 -17);
            ctx.drawImage(img_red,(5*x1+3*x2)/8 -13,(9*y1-y2)/8 -17);
            ctx.drawImage(img_red,(3*x1+5*x2)/8-13,(9*y1-y2)/8 -17);
            ctx.drawImage(img_red,x1+(x2-x1)/2-13, (9*y1-y2)/8 -17);

        }

        let img_blue = new Image();
        img_blue.src="./coptalli/cdn/images/player2.jpg";
        img_blue.onload = function(){
            for (var i =x1; i <= x2; i=i+(x2-x1)/4) {
                ctx.drawImage(img_blue,i-13,y2-17);
                ctx.drawImage(img_blue,i-13,(3*y2+y1)/4 -17);
            }

            ctx.drawImage(img_blue,x1+(x2-x1)/4-13, y2+(y2-y1)/4 -17);
            ctx.drawImage(img_blue,x1+3*(x2-x1)/4-13, y2+(y2-y1)/4 -17);
            ctx.drawImage(img_blue, x1+(x2-x1)/2 -13, y2+(y2-y1)/4 -17);
            ctx.drawImage(img_blue,(5*x1+3*x2)/8 -13,(9*y2-y1)/8 -17);
            ctx.drawImage(img_blue,(3*x1+5*x2)/8-13,(9*y2-y1)/8 -17);
            ctx.drawImage(img_blue,x1+(x2-x1)/2-13, (9*y2-y1)/8 -17);
        }
    }
    movingImage(x1:number, y1:number, x2:number, y2:number) {
        alert("drawing at" + x2 +" " + y2);
        let ctx : CanvasRenderingContext2D = this.canvas.nativeElement.getContext("2d");
        let img_blue = new Image();
        img_blue.src="./coptalli/cdn/images/player2.jpg";
        img_blue.onload = function(){
            ctx.drawImage(img_blue, x2, y2)
        }
    }
    getSinglePosition(event : any) {
        let ctx : CanvasRenderingContext2D = this.canvas.nativeElement.getContext("2d");

        let img_blue = new Image();
        img_blue.src="./coptalli/cdn/images/player2.jpg";
        img_blue.onload = function(){
            ctx.drawImage(img_blue, (event.clientX - 462), (event.clientY - 98));
        }
        alert("clientXY: "+(event.clientX - 462) +", " +(event.clientY - 98) + " XY: "+event.x +", " +event.y + "canvas:" +this.canvas.nativeElement.offsetLeft+"," + this.canvas.nativeElement.offsetTop );
/*        if (this.selectedGuthiX == -1) {
            this.selectedGuthiX = event.x;
            this.selectedGuthiY = event.y;
            alert("1st time Clicked!" + event.x +" " + event.y);
        }
        else {
            this.movingImage(this.selectedGuthiX, this.selectedGuthiY, event.x, event.y);
            this.selectedGuthiX = -1;
            this.selectedGuthiY = -1;
            alert("2nd time Clicked!" +"1st point:"+this.selectedGuthiX +","+this.selectedGuthiY+" 2nd point" +event.x +" " + event.y);
        }*/
        //this.movingImage(this.selectedGuthiX, this.selectedGuthiY, event.x, event.y);


    }
}

