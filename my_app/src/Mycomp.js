import React from 'react';
import jsonData from './down.json';


class Mycomp extends React.Component
{
    state = {
          people: jsonData,
          val:[]
        };

    name = evt => {
        console.log(evt.target.innerText);
        //const text=evt.target.innertext;
        const loc=this.state.val;
        loc.push(evt.target.innerText+"\n");
        this.setState({val:loc});
        //alert(text);
    }
    
    render()
    {
        //const dt=jsonData;
        const list=this.state.people.map((item)=>
            <li key={item.id} onClick={this.name}>
            {item.pollutant_id}</li>
        );    
        return (
            <div>
                <p>
                    {this.state.val.map((ele, i)=>
                        <li key={i}>{ele}</li> )}
                </p>
               
                 <ul>
                    {list}
                 </ul>
            </div>
        );
    }

}
export default Mycomp;