class Cell{
    constructor(mark){
        this.mark=mark
    }
    static newCell(mark){
        return new Cell(mark)
    }
    isMarked(){
        return this.mark!=="z"
    }

}
module.exports=Cell