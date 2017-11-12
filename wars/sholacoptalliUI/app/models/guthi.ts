export class Guthi{
	point: string;
	nextNode : Array<Guthi>;

	constructor(point:string, nextNode?:Array<Guthi>){
		this.point = point;
		this.nextNode = nextNode || [];
	}
	addNext(next:Guthi):void {
		this.nextNode.push(next);
	}
}
