fun stringIndexChange(str:String, index1:Int,index2:Int) : String {
    var save = ""
    for (i in 0..str.length-1) {
        if (i != index1 && i != index2) {
            save += str.get(i)
        }
        else if (i == index1){
            save += str.get(index2)
        }
        else if (i == index2){
            save += str.get(index1)
        }
    }
    return save
}
