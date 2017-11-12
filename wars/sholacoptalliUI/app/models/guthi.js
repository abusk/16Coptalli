"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Guthi = (function () {
    function Guthi(point, nextNode) {
        this.point = point;
        this.nextNode = nextNode || [];
    }
    Guthi.prototype.addNext = function (next) {
        this.nextNode.push(next);
    };
    return Guthi;
}());
exports.Guthi = Guthi;
//# sourceMappingURL=guthi.js.map