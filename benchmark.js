const floatCount=1250000

var op1 = []
var op2 = []

const start = Date.now()

console.log('Initializing at ' + start)

for (var i = 0; i < floatCount; i++) {
    op1.push(Math.random() * 100)
    op2.push(Math.random() * 100)
}

console.log('Fdivving +' + diffMs())

var promises = []
for (var i = 0; i < floatCount; i++) {
  promises.push(fdivPromise(op1[i], op2[i]))
}

Promise.all(promises)
.then(() => {
  console.log('Finished +' + diffMs())
})
.catch(err => {
  console.error('.catch error: ' + err)
})

//-------------------------------------------------------------------------------------------------
// fdivPromise
function fdivPromise(op1, op2) {
  return new Promise((resolve, reject) => {
    const result = op1 / op2
    // console.log(op1 + ' / ' + op2 + ' = ' + result)
    resolve(result)
  })
}

//-------------------------------------------------------------------------------------------------
// diffMs
function diffMs() {
    return Date.now() - start
}