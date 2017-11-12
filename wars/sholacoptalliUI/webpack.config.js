
var webpack = require("webpack"); //to access built-in plugins
var CompressionPlugin = require("compression-webpack-plugin");
var UglifyJsPlugin = require("uglifyjs-webpack-plugin");

module.exports = {
    entry: {
        "app": "./app/main"
    },
    output: {
        path: __dirname,
        filename: "./_dist/bundle.js",
        publicPath: 'http://localhost:4242/coptalli'
    },
    resolve: {
        extensions: [ '.js', '.ts', '.html']
    },
    devtool: 'source-map',
    module: {
        rules: [
            {
                test: /\.ts$/,
                loaders: [ 'babel-loader?presets[]=es2015','awesome-typescript-loader', 'angular2-template-loader','angular2-router-loader?genDir=compiled/app&aot=true'],
                exclude: [/\.(spec|e2e|d)\.ts$/]
            },
            {
                test: /\.html$/,
                use: ["html-loader?interpolate=require&-minimize"]
            }
        ]
    },
    plugins: [       
        new webpack.optimize.UglifyJsPlugin({ 
            sourceMap: true, 
            minimize: true 
        }),
        new webpack.optimize.OccurrenceOrderPlugin(true),      
        new CompressionPlugin({
            algorithm: "gzip",
            test: /\.js$|\.html$/,
            threshold: 10240,
            minRatio: 0.8
        }),
        new webpack.ContextReplacementPlugin(
            /angular(\\|\/)core(\\|\/)(esm(\\|\/)src|src)(\\|\/)linker/,
            __dirname
        )
    ],
    devServer: {
        historyApiFallback: true,
        stats: 'minimal',
        inline: true,
        port: 4242
    }
}
