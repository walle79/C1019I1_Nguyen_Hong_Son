function render(row,colume) {
    var resume = "<table cellpadding='0' cellspacing='0'>";
    for(i=0;i<row;i++){
        resume +="<tr>";
        for(j=0;j<colume;j++){
            resume +="<td>";
            resume +="<button id='but"+i+"_"+j+"'></button>";
            resume +="</td>";
        }
        resume +="</tr>";
    }
    resume +="</table>";
    return resume;
}
function playgame() {
    var rows = document.getElementById("row").value;
    var columes = document.getElementById("colume").value;
    document.getElementById("main").innerHTML = render(rows,columes);
}