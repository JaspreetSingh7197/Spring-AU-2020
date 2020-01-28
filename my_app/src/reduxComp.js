
import jsonData from './down.json';

//let people_temp=jsonData;
let val_temp=[];

const reduxComp=(state,action) => {
   /* if(action.type== "CHANGE_DATA"){
        if(action.value!=null){
            people_temp=jsonData.map((item)=>
            <li key={item.id} >
            {item.pollutant_id}</li>
        );

        }
    }*/
    return {people: jsonData,val: val_temp};
}
export default reduxComp;