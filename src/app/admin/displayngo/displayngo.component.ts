import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgoService } from 'src/app/ngo.service';
import { Ngo } from 'src/app/ngoregistration/ngo';

@Component({
  selector: 'app-displayngo',
  templateUrl: './displayngo.component.html',
  styleUrls: ['./displayngo.component.css']
})
export class DisplayngoComponent implements OnInit {

  ngoList:Ngo[]=[];
  constructor(private ngoSer:NgoService,private router:Router) { }

  ngOnInit(): void {

    this.ngoSer.getNgoList().subscribe(data=>this.ngoList=data);
    

}
editNgo(n:Ngo){
  // alert("Edit Called!");
   console.log(n);
   sessionStorage.setItem("Ngo",JSON.stringify(n));
   this.router.navigate(['admin/editngo']);

 }
deleteNgo(n:Ngo){
  let result = confirm('Do you want to delete the ngo?')

    if(result)

    {
        
      this.ngoSer.deleteNgo(n.ngo_id)

        .subscribe( data => {

          this.ngoList = this.ngoList.filter(c => c !== n);

        });

      }


}


}
