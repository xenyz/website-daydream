module.exports = function(grunt) {

	grunt.initConfig({

		pkg: grunt.file.readJSON('package.json'),

		concat: {
			options: {
				style: 'compressed'
			},
			dist: {
				'assets/css/min.css': 'assets/css/main.scss'
			}
		}

	});

	grunt.loadNpmTasks('grunt-contrib-sass');

	grunt.registerTask('default', [ 'sass' ]);
};
