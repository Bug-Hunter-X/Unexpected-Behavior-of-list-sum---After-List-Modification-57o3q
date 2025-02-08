def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def myMethod(list) {
  list.add(6)
  println list.sum()
}
myMethod(list)
println list.sum() //This will print unexpected result