
var request = new XMLHttpRequest()

request.open('GET', 'https://apidoit.herokuapp.com/todoList', true)
request.onload = function () {
    // Begin accessing JSON data here
    var data = JSON.parse(this.response)

    if (request.status >= 200 && request.status < 400) {
        data.forEach(e => {
            console.log(e)
        })
    } else {
        console.log('error')
    }
}

request.send()


// // Create a "close" button and append it to each list item
// var myNodelist = document.getElementsByTagName("LI");
// var i;
// for (i = 0; i < myNodelist.length; i++) {
//   var span = document.createElement("SPAN");
//   var txt = document.createTextNode("\u00D7");
//   myNodelist[i].setAttribute('class', 'item');
//   myNodelist[i].setAttribute('draggable','true');
//   span.className = "remover";
//   span.appendChild(txt);
//   myNodelist[i].appendChild(span);
// }
//
// // Click on a close button to hide the current list item
// var close = document.getElementsByClassName("remover");
// var i;
// for (i = 0; i < close.length; i++) {
//   close[i].onclick = function() {
//     var div = this.parentElement;
//     div.remove();
//   }
// }
//
// // Add a "checked" symbol when clicking on a list item
// var list = document.querySelector('ul');
// list.addEventListener('click', function(ev) {
//   if (ev.target.tagName === 'LI') {
//     ev.target.classList.toggle('done');
//   }
// }, false);
//
// // Create a new list item when clicking on the "Add" button
// function newElement() {
//   var li = document.createElement("li");
//   var inputValue = document.getElementById("newTaskName").value;
//   var t = document.createTextNode(inputValue);
//   li.appendChild(t);
//   if (inputValue === '') {
//     alert("You must write something!");
//   } else {
//     document.getElementById("listItems").appendChild(li);
//   }
//   document.getElementById("newTaskName").value = "";
//
//   var span = document.createElement("SPAN");
//   var txt = document.createTextNode("\u00D7");
//   myNodelist = document.getElementsByTagName("LI");
//   var i;
//   for (i = 0; i < myNodelist.length; i++) {
//   myNodelist[i].setAttribute('class', 'item');
//   myNodelist[i].setAttribute('draggable', 'true');
//   }
//   span.className = "remover";
//   span.appendChild(txt);
//   li.appendChild(span);
//
//   for (i = 0; i < close.length; i++) {
//     close[i].onclick = function() {
//       var div = this.parentElement;
//       div.remove();
//     }
//   }
// }
//
// //---------------------------------------------
// var dragSrcEl = null;
//
// function handleDragStart(e) {
//   // Target (this) element is the source node.
//   dragSrcEl = this;
//
//   e.dataTransfer.effectAllowed = 'move';
//   e.dataTransfer.setData('text/html', this.outerHTML);
//
//   this.classList.add('dragElem');
// }
// function handleDragOver(e) {
//   if (e.preventDefault) {
//     e.preventDefault(); // Necessary. Allows us to drop.
//   }
//   this.classList.add('over');
//
//   e.dataTransfer.dropEffect = 'move';  // See the section on the DataTransfer object.
//
//   return false;
// }
//
// function handleDragEnter(e) {
//   // this / e.target is the current hover target.
// }
//
// function handleDragLeave(e) {
//   this.classList.remove('over');  // this / e.target is previous target element.
// }
//
// function handleDrop(e) {
//   // this/e.target is current target element.
//
//   if (e.stopPropagation) {
//     e.stopPropagation(); // Stops some browsers from redirecting.
//   }
//
//   // Don't do anything if dropping the same column we're dragging.
//   if (dragSrcEl != this) {
//     // Set the source column's HTML to the HTML of the column we dropped on.
//     //alert(this.outerHTML);
//     //dragSrcEl.innerHTML = this.innerHTML;
//     //this.innerHTML = e.dataTransfer.getData('text/html');
//     this.parentNode.removeChild(dragSrcEl);
//     var dropHTML = e.dataTransfer.getData('text/html');
//     this.insertAdjacentHTML('beforebegin',dropHTML);
//     var dropElem = this.previousSibling;
//     addDnDHandlers(dropElem);
//
//   }
//   this.classList.remove('over');
//   return false;
// }
//
// function handleDragEnd(e) {
//   // this/e.target is the source node.
//   this.classList.remove('over');
//
//   /*[].forEach.call(cols, function (col) {
//     col.classList.remove('over');
//   });*/
// }
//
// function addDnDHandlers(elem) {
//   elem.addEventListener('dragstart', handleDragStart, false);
//   elem.addEventListener('dragenter', handleDragEnter, false)
//   elem.addEventListener('dragover', handleDragOver, false);
//   elem.addEventListener('dragleave', handleDragLeave, false);
//   elem.addEventListener('drop', handleDrop, false);
//   elem.addEventListener('dragend', handleDragEnd, false);
//
// }
//
// var cols = document.querySelectorAll('#listItems .item');
// [].forEach.call(cols, addDnDHandlers);