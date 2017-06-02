import {Guthi} from './guthi';

export class Player {
    playerId:string;
	guthis:Array<Guthi>;

	constructor(playerId:string,guthis?:Array<Guthi>){
		this.playerId = playerId;
		this.guthis = guthis || [];
	}
	addGuthi(guthi:Guthi):void {
		this.guthis.push(guthi);
	}
	removeGuthis(guthis:Array<Guthi>):number {
		this.guthis.
		return this.guthis.length;
	}
}
