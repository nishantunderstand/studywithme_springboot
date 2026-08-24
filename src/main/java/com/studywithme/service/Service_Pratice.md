// GET ALL

public List<StudentResponse> getAllStudent(){
List<Student> stlist = studentRespoistory.findAll();

List<StudentResponse> response = new ArrayList<>();

for(StudentResponse sp : response){ 

    sp.setId(stlist.getId());
    sp.setFirstName(stlist.getFirstName());
    sp.setlastName(stlist.getlastname());
    
}

}


// POST 


// PUT 

// DELETE




}