/**
 * Created by Zeosunang on 15.04.2017.
 */
module.exports = function (grunt) {
    // Do grunt-related things in here

    grunt.initConfig({
        ts: {
            default: {
                outDir: "tmp/",
                src: ["js/*.ts"],
                options: {
                    fast: "always"
                }
            }
        },
        tslint: {
            options: {
                // can be a configuration object or a filepath to tslint.json
                configuration: "tslint.json",
                // If set to true, tslint errors will be reported, but not fail the task
                // If set to false, tslint errors will be reported, and the task will fail
                force: false,
                fix: false
            },
            files: {
                src: ["js/*.ts"]
            }
        },
        concat: {
            options: {
                separator: ';',
            },
            dist: {
                src: ['js/*.js', 'tmp/*.js'],
                dest: 'tmp/app.js',
            },
        },
        uglify: {
            build: {
                src: 'tmp/app.js',
                dest: '../app.min.js'
            }
        },
        connect: {
            serve: {
                options: {
                    port: grunt.option('port') || '8000',
                    hostname: grunt.option('host') || 'localhost'
                }
            }
        },
        clean: ['tmp']

    });

    grunt.loadNpmTasks("grunt-ts");
    grunt.loadNpmTasks("grunt-tslint");
    grunt.loadNpmTasks('grunt-contrib-uglify');
    grunt.loadNpmTasks('grunt-contrib-concat');
    grunt.loadNpmTasks('grunt-contrib-clean');

    grunt.registerTask("default", ["tslint", "ts", "concat", "uglify"]);
    grunt.registerTask("watch", []);

};