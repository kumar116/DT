/* global variable stack */
myStack = new Meteor.Collection("myStack");
stackCount = 0;

//allows
myStack.allow({
    insert: function(userId, doc) {
	return true;
    },
    update: function(userId, doc) {
	return true;
    },
    remove: function(userId, doc) {
	return true;
    }
});


