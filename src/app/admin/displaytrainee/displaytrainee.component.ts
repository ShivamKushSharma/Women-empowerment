import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/step/register/user';
import { UserService } from 'src/app/user.service';

@Component({
  selector: 'app-displaytrainee',
  templateUrl: './displaytrainee.component.html',
  styleUrls: ['./displaytrainee.component.css']
})
export class DisplaytraineeComponent implements OnInit {

  userList:User[]=[];
  constructor(private userSer:UserService,private router:Router) { }

  ngOnInit(): void {

    
    this.userSer.getUserList().subscribe(data=>this.userList=data);
    console.log(this.userList);
    

}
edittrainee(u:User){
  // alert("Edit Called!");
   console.log(u);
   sessionStorage.setItem("User",JSON.stringify(u));
   this.router.navigate(['admin/edittrainee']);

 }
deletetrainee(u:User){
  let result = confirm('Do you want to delete the Trainee?')

    if(result)

    {
        
      this.userSer.deleteUser(u.r_id)

        .subscribe( data => {

          this.userList = this.userList.filter(c => c !== u);

        });

      }


}

}
