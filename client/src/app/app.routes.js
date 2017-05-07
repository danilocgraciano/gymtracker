"use strict";
var router_1 = require("@angular/router");
var exercicio_list_1 = require("./exercicio/list/exercicio.list");
var exercicio_form_1 = require("./exercicio/form/exercicio.form");
var appRoutes = [
    { path: 'exercicios', component: exercicio_list_1.ExercicioList },
    { path: 'exercicio', component: exercicio_form_1.ExercicioForm },
    { path: '**', component: exercicio_list_1.ExercicioList }
];
exports.routing = router_1.RouterModule.forRoot(appRoutes);
//# sourceMappingURL=app.routes.js.map