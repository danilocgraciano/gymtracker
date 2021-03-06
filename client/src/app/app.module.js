"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var core_1 = require("@angular/core");
var platform_browser_1 = require("@angular/platform-browser");
var http_1 = require("@angular/http");
require("rxjs/add/operator/map");
var app_routes_1 = require("./app.routes");
var forms_1 = require("@angular/forms");
var app_component_1 = require("./app.component");
var exercicio_component_1 = require("./exercicio/exercicio.component");
var exercicio_list_1 = require("./exercicio/list/exercicio.list");
var exercicio_form_1 = require("./exercicio/form/exercicio.form");
var exercicio_service_1 = require("./exercicio/service/exercicio.service");
var AppModule = (function () {
    function AppModule() {
    }
    return AppModule;
}());
AppModule = __decorate([
    core_1.NgModule({
        imports: [platform_browser_1.BrowserModule, http_1.HttpModule, app_routes_1.routing, forms_1.FormsModule, forms_1.ReactiveFormsModule],
        declarations: [app_component_1.AppComponent, exercicio_list_1.ExercicioList, exercicio_form_1.ExercicioForm, exercicio_component_1.ExercicioComponent],
        providers: [exercicio_service_1.ExercicioService],
        bootstrap: [app_component_1.AppComponent]
    })
], AppModule);
exports.AppModule = AppModule;
//# sourceMappingURL=app.module.js.map