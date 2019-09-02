import { SchoolService } from '../../../services/school.service';
import { School } from '../../../models/school';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-school',
  templateUrl: './create-school.component.html',
  styleUrls: ['./create-school.component.scss']
})
export class CreateSchoolComponent implements OnInit {

  school: School = new School();
  submitted = false;

  constructor(private schoolService: SchoolService,
    private router: Router) { }

  ngOnInit() {
  }

  newSchool(): void {
    this.submitted = false;
    this.school = new School();
  }

  savesch() {
    this.schoolService.createSchool(this.school)
      .subscribe(data => console.log(data), error => console.log(error));
    this.school = new School();
    this.gotoListsch();
  }

  onSubmitsch() {
    this.submitted = true;
    this.savesch();    
  }

  gotoListsch() {
    this.router.navigate(['/school']);
  }
}
