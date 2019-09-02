import { Observable } from "rxjs";
import { SchoolService } from "../../services/school.service";
import { School } from "../../models/school";
import { Component, OnInit } from "@angular/core";
import { Router } from '@angular/router';


@Component({
  selector: 'app-school',
  templateUrl: './school.component.html',
  styleUrls: ['./school.component.scss']
})
export class SchoolComponent implements OnInit {
  schools: Observable<School[]>;
  
  constructor(private schoolService: SchoolService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.schools = this.schoolService.getSchoolList();
  }

  deleteSchool(id: number) {
    this.schoolService.deleteSchool(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  schoolDetails(id: number){
    this.router.navigate(['school/details', id]);
  }
}
