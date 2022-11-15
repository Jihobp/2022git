d3.selectAll("span")
    .datum(function(){return this.dataset})
    .style("height", "10%")
    .style("left", (d,i)=>(i*80)="px") //전달인수 d=data, i=index
    .transition().duration(1500)
    .style("height", d=>d.val+"%");