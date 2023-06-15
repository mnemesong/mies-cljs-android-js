try{
	require('./assets/backend-stub');
} catch (e) {
	const back = require('androidjs').back;
	back.on("hello from front", function(){
		back.send(
			"hello from back", 
			"Error: <br>" + (e.toString ? e.toString().replace('\n', '<br>') + '<br>' : '') 
				+ JSON.stringify(e, null, 2)
		);
	});
	console.log(e);
}