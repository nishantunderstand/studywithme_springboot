// GET
return ResponseEntity.ok(response);

// GET ALL
return ResponseEntity.ok(response);

// POST
return ResponseEntity
.status(HttpStatus.CREATED)
.body(response);

// PUT
return ResponseEntity.ok(response);

// DELETE
return ResponseEntity.noContent().build();



GET       → 200 OK
POST      → 201 CREATED
PUT       → 200 OK
DELETE    → 204 NO CONTENT