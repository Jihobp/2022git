import define1 from "./a33468b95d0b15b0@808.js";

function _1(md){return(
md`# Flowers and Tracks

We have a saying that, *"Even the most dangerous things can be quite beautiful."*

Take a few minutes and look at the piece below and tell me what you can see.`
)}

function _2(md){return(
md`---`
)}

function _chart(d3,graticule,path,longitude,projection,formatLongitude,trackData,petalPath,intensity,color)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#314d7a');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  // svg.append('path')
  //   .datum(basemap)
  //     .attr('d', path)
  //     .attr('fill', 'gray')
  //     .attr('stroke', 'white')
  //     .attr('stroke-width', '0.2px')
  //     .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
      svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*20)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _4(md){return(
md`### Maybe it reminded you of the bliss of summer from your childhood?`
)}

function _5(md){return(
md`### Or maybe you were reminded of the famous cherry blossoms of Japan and South Korea that attracts millions of tourists year after year?`
)}

function _6(md){return(
md`---`
)}

function _7(md){return(
md`## Let's see what's behind these flowers`
)}

function _chart1(d3,graticule,path,longitude,projection,formatLongitude,trackData,petalPath,intensity,color)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#314d7a');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  // svg.append('path')
  //   .datum(basemap)
  //     .attr('d', path)
  //     .attr('fill', 'gray')
  //     .attr('stroke', 'white')
  //     .attr('stroke-width', '0.2px')
  //     .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
      svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*20)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _chart2(d3,graticule,path,longitude,projection,formatLongitude,trackData,petalPath,intensity,color)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#314d7a');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  // svg.append('path')
  //   .datum(basemap)
  //     .attr('d', path)
  //     .attr('fill', 'gray')
  //     .attr('stroke', 'white')
  //     .attr('stroke-width', '0.2px')
  //     .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' || hour[3] == '12:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
      svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*10)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _chart3(d3,graticule,path,longitude,projection,formatLongitude,trackData,petalPath,intensity,color)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#314d7a');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  // svg.append('path')
  //   .datum(basemap)
  //     .attr('d', path)
  //     .attr('fill', 'gray')
  //     .attr('stroke', 'white')
  //     .attr('stroke-width', '0.2px')
  //     .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
      svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('path')
        .attr('d',petalPath)
        .attr('class', data.key)
        .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
        // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
        .attr('fill', (d, i) => color(filteredData.intensity[i]))
        .attr('opacity', 0.8)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*10)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _chart4(d3,graticule,path,longitude,projection,formatLongitude,trackData,intensity)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#314d7a');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  // svg.append('path')
  //   .datum(basemap)
  //     .attr('d', path)
  //     .attr('fill', 'gray')
  //     .attr('stroke', 'white')
  //     .attr('stroke-width', '0.2px')
  //     .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
    //   svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.5)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*10)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _chart5(d3,basemap,path,graticule,longitude,projection,formatLongitude,trackData,intensity)
{
  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600])
  //   .style('background-color', '#647C90');

  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600]);

  // svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  svg.append('path')
    .datum(basemap)
      .attr('d', path)
      .attr('fill', '#C5C5C5')
      .attr('stroke', 'white')
      .attr('stroke-width', '0.2px')
      .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
    //   svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.5)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*10)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _13(md){return(
md`## I think you have a good idea now of what these tracks were actually.`
)}

function _chart6(d3,basemap,path,graticule,longitude,projection,formatLongitude,trackData,intensity)
{
  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600])
    .style('background-color', '#647C90');

  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600]);

  // svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  svg.append('path')
    .datum(basemap)
      .attr('d', path)
      .attr('fill', '#C5C5C5')
      .attr('stroke', 'white')
      .attr('stroke-width', '0.2px')
      .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  // svg.append('g')
  //   .attr('transform', 'translate(20, 10)')
  //   .attr('opacity', 0.8)
  //   .append(() => legend({color, 
  //                         title: 'Intensity (kts)',
  //                         tickSize: 0,
  //                         width: 180
  //                        }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
    //   svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.5)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(filteredData.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 1 : intensity(filteredData.intensity[i])*10)
        //.attr('r', (d, i) => )
        .attr('fill', 'white')
        .attr('opacity', 0.5)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 28)
    .attr('font-weight', 600)
    .attr('fill', '#2e2e2e')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(807, 505)')
    .text('');
  
  return svg.node();
}


function _chart7(d3,basemap,path,graticule,legend,coloralt,longitude,projection,formatLongitude,trackData,intensity)
{
  const svg = d3.create('svg')
    .attr('viewBox', [0, 0, 960, 600])
    .style('background-color', '#647C90');

  // const svg = d3.create('svg')
  //   .attr('viewBox', [0, 0, 960, 600]);

  // svg.style("background","url('https://i0.wp.com/pixahive.com/wp-content/uploads/2021/03/Paper-texture-background-392323-pixahive.jpg') ");
  
  svg.append('path')
    .datum(basemap)
      .attr('d', path)
      .attr('fill', '#C5C5C5')
      .attr('stroke', 'white')
      .attr('stroke-width', '0.2px')
      .attr('stroke-linejoin', 'round');
    
  svg.append('path')
    .datum(graticule)
      .attr('d', path)
      .attr('stroke', 'white')
      .attr('stroke-width', '0.3px')
      .attr('stroke-opacity', 0.5);
  
  svg.append('g')
    .attr('transform', 'translate(20, 10)')
    .attr('opacity', 0.8)
    .append(() => legend({color: coloralt, 
                          title: 'Intensity (kts)',
                          tickSize: 0,
                          width: 180
                         }));
  
  const xGraticuleG = svg.append('g')
    .attr('font-size', 10)
    .attr('font-family', 'sans-serif')
    .attr('fill', 'white')
    .attr('opacity', 0.25)
    .attr('text-anchor', 'start');
  
  longitude.map(x => {
    xGraticuleG.append('text')
      .attr('transform', `translate(${projection([x, -7]) + ""}) rotate(-90)`)
      .text(formatLongitude(x))
      .attr('y', 11)
  })
  
  for (const data of trackData) {
    
    svg.append('path')
      .datum(data)
        .attr('d', path)
        .attr('fill', 'none')
        .attr('stroke', '#333333')
        // .attr('stroke-width', '2px')
        .attr('opacity', 0.8);

    let myScale = 0.1;
    let filteredData = {'coordinates':[],'intensity':[]};
    
    console.log('data',data);
    
    for(var i=0;i<data.time.length;i++){
        let hour = data.time[i].split(" ");
        if(hour[3] == '00:00' || hour[3] == '6:00' ){
          filteredData.coordinates.push(data.coordinates[i]);
          filteredData.intensity.push(data.intensity[i]);
        }
    }

    console.log('filter',filteredData);
    
    //   svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(0) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(72) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(144) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.5)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(216) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)

    // svg.append('g')
    //   .selectAll('.' + data.key)
    //   .data(filteredData.coordinates)
    //   .join('path')
    //     .attr('d',petalPath)
    //     .attr('class', data.key)
    //     .attr('transform', (d,i) => `translate(${projection(d)}) rotate(288) scale(${intensity(filteredData.intensity[i])/2})`)
    //     // .attr('r', (d, i) => i === 0 ? 5 : 2.5)
    //     .attr('fill', (d, i) => color(filteredData.intensity[i]))
    //     .attr('opacity', 0.8)
    //     .attr('stroke', 'white')
    //     .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
    //     .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)


    svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('circle')
        .attr('class', data.key)
        .attr('transform', d => `translate(${projection(d)})`)
        .attr('r', (d, i) => i === 0 ? 0 : intensity(data.intensity[i])*50)
        .attr('fill', (d, i) => coloralt(data.intensity[i]))
        .attr('opacity', 0.6)
        .attr('stroke', 'white')
        .attr('stroke-opacity', (d, i) => i === 0 ? 0.8 : 0.2)
        .attr('stroke-width', (d, i) => i === 0 ? 0.8 : 0.5)
    
      
      svg.append('g')
      .selectAll('.' + data.key)
      .data(data.coordinates)
      .join('path')
        .append('title')
        .text((d, i) => data.time[i] + '\n' + 
              (data.intensity[i] !== 0 ? data.intensity[i] + ' kts' : 'Too weak / Fading'));
  }
  
  svg.append('text')
    .attr('font-family', 'sans-serif')
    .attr('font-style', 'italic')
    .attr('font-size', 72)
    .attr('font-weight', 600)
    .attr('fill', 'white')
    .attr('opacity', 0.8)
    .attr('transform', 'translate(735, 530)')
    .text('2019');
  
  return svg.node();
}


function _16(md){return(
md`> *The sizes of the circles were, just like their color, related to the intensity of the typhoon at that point in time.*
> 
> *The data used to display this came RSMC Tokyo-Typhoon Center as indicated by [@z-richard](https://observablehq.com/@z-richard) in his work were this [notebook](https://observablehq.com/@z-richard/northwestern-pacific-typhoon-track-v3-2019) was forked from.*
>
> `
)}

function _17(md){return(
md`---`
)}

function _18(md){return(
md`# These are the typhoon tracks on the northwestern Pacific area observed for 2019.`
)}

function _19(md){return(
md`---`
)}

function _20(md){return(
md`### *Most notable typhoon of 2019 in this area was Typhoon Hagibis.*`
)}

function _21(htl){return(
htl.html`<img src='https://upload.wikimedia.org/wikipedia/commons/b/b3/Typhoon_Hagibis_%282019%29_map.jpg' height="500px">`
)}

function _22(md){return(
md`This typhoon, in particular, was described as *the fingerprint of global warming* in an [article](https://www.scientificamerican.com/article/climate-change-caused-4-billion-of-typhoons-damage/#) published in **Scientific American**. In fact it brought the [highest rainfall observed](https://www.worldweatherattribution.org/climate-change-added-4bn-to-damage-of-japans-typhoon-hagibis/) in Japan's recorded history.

In total, Typhoon Hagibis took the lives of [121 and left 3 people missing until now](https://en.wikipedia.org/wiki/Typhoon_Hagibis). Of the estimated *10 billion* damages [*4 billion*](https://www.scientificamerican.com/article/climate-change-caused-4-billion-of-typhoons-damage/#) can be attributed to climate change.  `
)}

function _23(md){return(
md`---`
)}

function _24(md){return(
md`# The likely of an event like Hagibis occurring has been increased to [67% due to climate change](https://www.scientificamerican.com/article/climate-change-caused-4-billion-of-typhoons-damage/#).`
)}

function _25(md){return(
md`Year after year we are breaking record after record related to climate change such as heatwaves, sea level rise, drought, intensity of typhoons, and so on. `
)}

function _26(md){return(
md`---`
)}

function _27(md){return(
md`## *Hence, there is a need more than ever to take action against climate change.*`
)}

function _28(htl){return(
htl.html`<a href="https://climate.nasa.gov/"><button style="height:30px; ">Learn more about Climate Change</button></a>`
)}

function _29(md){return(
md`---`
)}

function _30(md){return(
md`---`
)}

function _31(md){return(
md`### *Set up lines*`
)}

function _formatLongitude(){return(
x => `${Math.abs(x)}°${x < 0 ? 'W' : 'E'}`
)}

function _formatTime(d3){return(
d3.timeFormat('%B %d, %Y %H:%M')
)}

function _intensity(d3){return(
d3.scaleLinear()
  .domain([34, 48, 64, 85, 105])
  .range([0.06,0.12,0.18,0.24,0.3])
)}

function _coloralt(d3){return(
d3.scaleThreshold()
  .domain([34, 48, 64, 85, 105])
  .range(['#8299d9', '#4d63a1', '#e3ce71', '#e0ae51', '#e69035', '#e05f34'])
)}

function _color(d3){return(
d3.scaleThreshold()
  .domain([34, 48, 64, 85, 105])
  .range(['#f6bc66','#f69c6d','#f68c70','#f57c73','#f56c77','#f55c7a'])
)}

function _graticule(d3){return(
d3.geoGraticule10()
)}

function _path(d3,projection){return(
d3.geoPath().projection(projection)
)}

function _projection(d3){return(
d3.geoMercator()
  .rotate([-140, 0])
  .center([0, 25])  
  .scale([600])
)}

function _basemap(d3,topojson){return(
d3.json('https://unpkg.com/world-atlas@1.1.4/world/50m.json').then(data => {
  return topojson.feature(data, data.objects.countries)
})
)}

function _trackData(FileAttachment,formatTime){return(
FileAttachment('point-data.json').json().then(d => {
  let result = []
  for (const key in d) {
    const rawData = d[key];
    result.push({
      'type': "LineString",
      'coordinates': rawData.map(d2 => d2.location),
      'intensity': rawData.map(d2 => d2.intensity),
      'time': rawData.map(d2 => formatTime(new Date(d2.time))),
      'number': key
    });
  } 
  return result;
})
)}

function _longitude(d3){return(
d3.range(100, 181, 20)
)}

function _topojson(require){return(
require("topojson-client@3")
)}

function _44(md){return(
md`*This petalPath is from [@sxywu's](https://observablehq.com/@sxywu/) Introduction to D3.js Workshop*`
)}

function _petalPath(){return(
"M0,0 C50,40 50,70 20,100 L0,85 L-20,100 C-50,70 -50,40 0,0"
)}

function __(require){return(
require('lodash')
)}

function _d3(require){return(
require('d3@5')
)}

export default function define(runtime, observer) {
  const main = runtime.module();
  function toString() { return this.url; }
  const fileAttachments = new Map([
    ["point-data.json", {url: new URL("./files/59043c111274a27ebf73fed54359203b6a76decd910308ad1233a898571445b943fe17e60c37c4d31bf3dea812aa16a901c36f774a75ab6198b62dbe69f21577.json", import.meta.url), mimeType: "application/json", toString}]
  ]);
  main.builtin("FileAttachment", runtime.fileAttachments(name => fileAttachments.get(name)));
  main.variable(observer()).define(["md"], _1);
  main.variable(observer()).define(["md"], _2);
  main.variable(observer("chart")).define("chart", ["d3","graticule","path","longitude","projection","formatLongitude","trackData","petalPath","intensity","color"], _chart);
  main.variable(observer()).define(["md"], _4);
  main.variable(observer()).define(["md"], _5);
  main.variable(observer()).define(["md"], _6);
  main.variable(observer()).define(["md"], _7);
  main.variable(observer("chart1")).define("chart1", ["d3","graticule","path","longitude","projection","formatLongitude","trackData","petalPath","intensity","color"], _chart1);
  main.variable(observer("chart2")).define("chart2", ["d3","graticule","path","longitude","projection","formatLongitude","trackData","petalPath","intensity","color"], _chart2);
  main.variable(observer("chart3")).define("chart3", ["d3","graticule","path","longitude","projection","formatLongitude","trackData","petalPath","intensity","color"], _chart3);
  main.variable(observer("chart4")).define("chart4", ["d3","graticule","path","longitude","projection","formatLongitude","trackData","intensity"], _chart4);
  main.variable(observer("chart5")).define("chart5", ["d3","basemap","path","graticule","longitude","projection","formatLongitude","trackData","intensity"], _chart5);
  main.variable(observer()).define(["md"], _13);
  main.variable(observer("chart6")).define("chart6", ["d3","basemap","path","graticule","longitude","projection","formatLongitude","trackData","intensity"], _chart6);
  main.variable(observer("chart7")).define("chart7", ["d3","basemap","path","graticule","legend","coloralt","longitude","projection","formatLongitude","trackData","intensity"], _chart7);
  main.variable(observer()).define(["md"], _16);
  main.variable(observer()).define(["md"], _17);
  main.variable(observer()).define(["md"], _18);
  main.variable(observer()).define(["md"], _19);
  main.variable(observer()).define(["md"], _20);
  main.variable(observer()).define(["htl"], _21);
  main.variable(observer()).define(["md"], _22);
  main.variable(observer()).define(["md"], _23);
  main.variable(observer()).define(["md"], _24);
  main.variable(observer()).define(["md"], _25);
  main.variable(observer()).define(["md"], _26);
  main.variable(observer()).define(["md"], _27);
  main.variable(observer()).define(["htl"], _28);
  main.variable(observer()).define(["md"], _29);
  main.variable(observer()).define(["md"], _30);
  main.variable(observer()).define(["md"], _31);
  main.variable(observer("formatLongitude")).define("formatLongitude", _formatLongitude);
  main.variable(observer("formatTime")).define("formatTime", ["d3"], _formatTime);
  main.variable(observer("intensity")).define("intensity", ["d3"], _intensity);
  main.variable(observer("coloralt")).define("coloralt", ["d3"], _coloralt);
  main.variable(observer("color")).define("color", ["d3"], _color);
  main.variable(observer("graticule")).define("graticule", ["d3"], _graticule);
  main.variable(observer("path")).define("path", ["d3","projection"], _path);
  main.variable(observer("projection")).define("projection", ["d3"], _projection);
  main.variable(observer("basemap")).define("basemap", ["d3","topojson"], _basemap);
  main.variable(observer("trackData")).define("trackData", ["FileAttachment","formatTime"], _trackData);
  main.variable(observer("longitude")).define("longitude", ["d3"], _longitude);
  main.variable(observer("topojson")).define("topojson", ["require"], _topojson);
  main.variable(observer()).define(["md"], _44);
  main.variable(observer("petalPath")).define("petalPath", _petalPath);
  const child1 = runtime.module(define1);
  main.import("legend", child1);
  main.variable(observer("_")).define("_", ["require"], __);
  main.variable(observer("d3")).define("d3", ["require"], _d3);
  return main;
}
