import React, { useState,} from 'react';
import { useNavigate,Link} from "react-router-dom";


function GalleryVideos()
{
  const [reg, setreg] = useState({});
  const handleChange1 = (event) => {
      const name = event.target.name;
      const value = event.target.value;
      setreg(values => ({ ...values, [name]: value }))
      console.log("values fetching");
  }
  const handleSubmit = (event) => {
   console.log("values fetched");
     let demo = JSON.stringify(reg);
     fetch("http://localhost:8060/api/GalleryVideos/",{
         method: 'POST',
         headers: { 'Content-type': 'application/json' },
         body: demo
     }).then(r => { console.log(r.json()) })
     event.preventDefault();
     alert("Video Added");
  }
   const defaultValue={
      videoDescription:"",
      videoPath:"",
      galleryAlbumId:"",
      
      }
return(
<div className="container">
<Link to='/AdminHome'>back</Link>
       <div className="col-md-12-text-center mt-5">
       <div className="regis">
        <h1 style={{textAlign:"center"}}>Gallery Video</h1>
       
         
           <form onSubmit={handleSubmit} className="form-control">
           
           
       
        <div>
        <label>Gallery Video Name</label> <input type="text" name="galleryAlbum" placeholder="Enter Video Name" value={reg.galleryAlbum} onChange={handleChange1} className="form-control"/>
        </div>
       <br></br>
        <div>
        <label>Choose Video</label> <input type="file" name="videoPath" placeholder="Choose File" value={reg.videoPath} onChange={handleChange1} className="form-control"/>
        </div>
        <br></br>
        
      <button className="btn btn-primary" type="submit">
           Submit
   </button>
           </form>
          </div>
       </div>
       </div>
);
}
export default GalleryVideos;