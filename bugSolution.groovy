def list = [1, 2, 3, 4, 5]

println list.sum() //This will work fine

def myMethod(list) {
  list = list + [6] //Create a new list instead of modifying the original 
  println list.sum()
}
myMethod(list)
println list.sum() //This will print expected result