import { Component, OnInit } from '@angular/core';
import { Major } from 'src/app/models/major';
import { ActivatedRoute, Router } from '@angular/router';
import { MajorService } from 'src/app/services/major.service';

@Component({
  selector: 'app-major-detail',
  templateUrl: './major-detail.component.html',
  styleUrls: ['./major-detail.component.scss']
})
export class MajorDetailComponent implements OnInit {

  id: number;
  major: Major;

  constructor(private route: ActivatedRoute,private router: Router,
    private majorService: MajorService) { }

  ngOnInit() {this.major = new Major();

    this.id = this.route.snapshot.params['id'];
    
    this.majorService.getMajor(this.id)
      .subscribe(data => {
        console.log(data)
        this.major = data;
      }, error => console.log(error));
  }

  update(): void {
    this.majorService.updateMajor(this.major,this.id).subscribe(()=>this.list());
  }
  
  list(){
    this.router.navigate(['major']);
  }
}
