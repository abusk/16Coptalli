(function (global) {
    System.config({
        // DEMO ONLY! REAL CODE SHOULD NOT TRANSPILE IN THE BROWSER
        transpiler: 'ts',
        typescriptOptions: {
            tsconfig: true
        },
        meta: {
            'typescript': {
                "exports": "ts"
            }
        },
        paths: {
            // paths serve as alias
            'npm:': 'https://unpkg.com/'
        },
        // map tells the System loader where to look for things
        map: {
            // our app is within the app folder
            app: 'app',

            // angular bundles
            '@angular/core': 'npm:@angular/core/bundles/core.umd.js',
            '@angular/common': 'npm:@angular/common/bundles/common.umd.js',
            '@angular/compiler': 'npm:@angular/compiler/bundles/compiler.umd.js',
            '@angular/platform-browser': 'npm:@angular/images-browser/bundles/images-browser.umd.js',
            '@angular/platform-browser-dynamic': 'npm:@angular/images-browser-dynamic/bundles/images-browser-dynamic.umd.js',
            '@angular/http': 'npm:@angular/http/bundles/http.umd.js',
            '@angular/router': 'npm:@angular/router/bundles/router.umd.js',
            '@angular/forms': 'npm:@angular/forms/bundles/forms.umd.js',
            '@angular/upgrade': 'npm:@angular/upgrade/bundles/upgrade.umd.js',


            // other libraries
            'ng2-file-upload' : 'npm:ng2-file-upload',
            'angular2-datatable':'npm:angular2-datatable',
            'lodash': 'npm:lodash/lodash.js',

            'moment': 'npm:moment/moment.js',
            // 'ng2-bootstrap/ng2-bootstrap': 'npm:ng2-bootstrap/bundles/ng2-bootstrap.min.js',

            'rxjs':                      'npm:rxjs',
            'angular-in-memory-web-api': 'npm:angular-in-memory-web-api',
            'ts':                        'npm:plugin-typescript@4.0.10/lib/plugin.js',
            'typescript':                'npm:typescript@2.0.2/lib/typescript.js',
            'mydatepicker': 'npm:mydatepicker',
            'ng2-bs3-modal': 'npm:ng2-bs3-modal',
            'debug': '../node_modules/debug/browser.js',
            'angular2-highlight-js': 'node_modules/angular2-highlight-js/lib',
            'ng2-charts': 'node_modules/ng2-charts@1.1.0',



        },
        // packages tells the System loader how to load when no filename and/or no extension
        packages: {
            app: {
                main: './main.ts',
                defaultExtension: 'ts'
            },
            rxjs: {
                defaultExtension: 'js'
            },
            'angular-in-memory-web-api': {
                main: './index.js',
                defaultExtension: 'js'
            },
            'ng2-file-upload':{
                main: 'ng2-file-upload.js',
                defaultExtension: 'js'
            },
            'mydatepicker': {
                defaultExtension: 'js'
            },
            'angular2-datatable':{
                main: 'index.js',
                defaultExtension: 'js'
            },
            'ng2-charts': {
                main: 'ng2-charts.js',
                defaultExtension: 'js'
            },
            'angular2-highlight-js': {
                main: 'highlight-js.module',
                defaultExtension: 'js'
        }
        }
    });
})(this);
