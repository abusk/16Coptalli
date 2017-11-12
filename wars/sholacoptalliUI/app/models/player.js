"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Player = (function () {
    function Player(playerId, guthis) {
        this.playerId = playerId;
        this.guthis = guthis || [];
    }
    Player.prototype.addGuthi = function (guthi) {
        this.guthis.push(guthi);
    };
    Player.prototype.removeGuthis = function (guthis) {
        this.guthis.
        ;
        return this.guthis.length;
    };
    return Player;
}());
exports.Player = Player;
//# sourceMappingURL=player.js.map