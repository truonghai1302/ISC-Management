import { Component, OnInit, Input } from '@angular/core';
import { SchoolService } from '../../../services/school.service';
import { SchoolComponent } from '../school.component';
import { Router, ActivatedRoute } from '@angular/router';
import { School } from '../../../models/school';
import { __values } from 'tslib';


@Component({
  selector: 'app-school-details',
  templateUrl: './school-details.component.html',
  styleUrls: ['./school-details.component.scss']
})
export class SchoolDetailsComponent implements OnInit {

  id: number;
  school: School;

  constructor(private route: ActivatedRoute,private router: Router,
    private schoolService: SchoolService) { }

  ngOnInit() {this.school = new School();

    this.id = this.route.snapshot.params['id'];
    
    this.schoolService.getSchool(this.id)
      .subscribe(data => {
        console.log(data)
        this.school = data;
      }, error => console.log(error));
  }

  updatesch(): void {
    this.schoolService.updateSchool(this.school,this.id).subscribe(()=>this.listsch());
  }
  
  listsch(){
    this.router.navigate(['school']);
  }
}
