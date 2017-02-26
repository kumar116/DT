console.log("Welcome, to the Client.");

/* stack implementation in MongoDB */   
Template.example.events({
    'click #push': function() {
	myValue = document.getElementById('pushValue').value;
	myStack.insert({count: stackCount, stackValue: myValue});
	stackCount++;
	document.getElementById('isEmptyStatus').innerHTML = "";
    },
    'click #pop': function() {
	if(stackCount > 0) {
	    stackCount--;
	    var id = myStack.findOne({count: stackCount});
	    //do something with the value before removing it
	    //...
	    
	    
	    myStack.remove({_id: id._id});
	    document.getElementById('isEmptyStatus').innerHTML = "";
	}
    },
    'click #isEmpty': function() {
		if(myStack.find({}).count()==0) {
			document.getElementById('isEmptyStatus').innerHTML = "TRUE";
		} else {
			document.getElementById('isEmptyStatus').innerHTML = "FALSE";
		}
    },
    'click #peek': function() {
	if(myStack.find({}).count() > 0) {
	    var peek = stackCount - 1;
	    var data = myStack.findOne({count: peek});
	    //do something with the peek value
	    //...
	
	    document.getElementById('peekValue').innerHTML=data.stackValue;
	} else {
	    document.getElementById('peekValue').innerHTML="Empty Stack";
	}
    },
    'click #reset': function() {
	/* delete all entries in the database, equivalent to reset */
		
		var loop = stackCount;
		for(var i=0; i<loop; i++) {
		    var id = myStack.findOne({count: i});
		    myStack.remove({_id: id._id});
		    stackCount--;
		}
		
		document.getElementById('isEmptyStatus').innerHTML = "";
			
    }
});

Template.printStack.values = function() {
    /*
    var values = myStack.find({});
    values.forEach( function (data) {
	console.log(data.count + " " + data.stackValue);
    });*/
    return myStack.find({}, {sort: {count:-1}});
};


if(Meteor.isClient) {
   
    //subscribe to collections
    Meteor.subscribe("myStack");
    
}
