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
var http_1 = require("@angular/http");
var core_1 = require("@angular/core");
var ExercicioService = (function () {
    function ExercicioService(http) {
        this.http = http;
        this.url = 'http://localhost:8080/GymTracker/api/exercicios';
        this.headers = new http_1.Headers();
        this.headers.append('Content-type', 'application/json');
    }
    ExercicioService.prototype.save = function (e) {
        return this.http.post(this.url, JSON.stringify(e), { headers: this.headers }).map(function (res) { return res.json(); });
    };
    ExercicioService.prototype.update = function (e) {
        return this.http.put(this.url + "/" + e.id, JSON.stringify(e), { headers: this.headers }).map(function (res) { return res.json(); });
    };
    ExercicioService.prototype.delete = function (id) {
        return this.http.delete(this.url + "/" + id, { headers: this.headers });
    };
    ExercicioService.prototype.findById = function (id) {
        return this.http.get(this.url + "/" + id, { headers: this.headers }).map(function (res) { return res.json(); });
    };
    ExercicioService.prototype.findAll = function (limit, offset) {
        return this.http.get(this.url, { headers: this.headers }).map(function (res) { return res.json(); });
    };
    return ExercicioService;
}());
ExercicioService = __decorate([
    core_1.Injectable(),
    __metadata("design:paramtypes", [http_1.Http])
], ExercicioService);
exports.ExercicioService = ExercicioService;
//# sourceMappingURL=exercicio.service.js.map