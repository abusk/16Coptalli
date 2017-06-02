import { Component, OnInit, AfterViewInit, ViewChild, ElementRef} from '@angular/core';

@Component({
  selector: 'app-layout',
  templateUrl: './layout.component.html',
  styleUrls: ['./layout.component.css']
})
export class LayoutComponent implements OnInit, AfterViewInit {

	@ViewChild('myCanvas') canvas: ElementRef;

  onClickMe(event){
     alert("clicked "+event.x +" "+event.y);
  }

  constructor() {
  	
   }

  ngOnInit() {
  }
  
  ngAfterViewInit(){

  	let ctx : CanvasRenderingContext2D = this.canvas.nativeElement.getContext("2d");

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
   img_red.src="./images/red_guthi.png"
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
   img_blue.src="./images/blue_guthi.png"
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

}
