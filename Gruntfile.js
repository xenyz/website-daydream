module.exports = function(grunt) {

	grunt.initConfig({

		pkg: grunt.file.readJSON('package.json'),

		sass: {
			dist: {
				options: {
					style: 'compressed'
				},
				files: {
					'assets/css/min.css': 'assets/css/main.scss'
				}
			}
		}

	});

	grunt.loadNpmTasks('grunt-contrib-sass');

	grunt.registerTask('default', [ 'sass' ]);
};
