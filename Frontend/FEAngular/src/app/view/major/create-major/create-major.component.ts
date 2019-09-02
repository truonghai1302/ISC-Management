import { Component, OnInit } from '@angular/core';
import { Major } from 'src/app/models/major';
import { MajorService } from 'src/app/services/major.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-major',
  templateUrl: './create-major.component.html',
  styleUrls: ['./create-major.component.scss']
})
export class CreateMajorComponent implements OnInit {

  major: Major = new Major();
  submitted = false;

  constructor(private majorService: MajorService,
    private router: Router) { }

  ngOnInit() {
  }

  newMajor(): void {
    this.submitted = false;
    this.major = new Major();
  }

  save() {
    console.log(this.major);
    this.majorService.createMajor(this.major)
      .subscribe(data => console.log(data), error => console.log(error));
    this.major = new Major();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();    
  }

  gotoList() {
    this.router.navigate(['/major']);
  }

}
