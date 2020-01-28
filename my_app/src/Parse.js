import React from 'react';
import {connect} from "react-redux";


class Parse extends React.Component
{
    /*constructor(props)
    {
        super(props);
    }
    
    
    name = evt => {
        console.log(evt.target.innerText);
        //const text=evt.target.innertext;
        const loc=this.state.val;
        loc.push(evt.target.innerText+"\n");
        this.setState({val:loc});
        //alert(text);
    }*/
    
    render()
    {
        //const dt=jsonData;
        const list = this.props.people && this.props.people.map((item)=>
            <li key={item.id}>
            {item.pollutant_id}</li>
        );    
        return (

            <div>
                 <p>
                    {this.props.val.map((ele, i)=>
                        <li key={i}>{ele}</li> )}
                </p>
                 <ul>
                    {list}
                 </ul>
            </div>
        );
    }

}

const mapNamesToProps=(state)=>{
    return {people: state.people, val: state.val};
};
export default connect(mapNamesToProps)(Parse);