// GET : 200
return ResponseEntity.ok(response);

// GET ALL : 200
return ResponseEntity.ok(response);

// POST : 201
return ResponseEntity
.status(HttpStatus.CREATED)
.body(response);

// PUT : 200
return ResponseEntity.ok(response);

// DELETE : 204
return ResponseEntity.noContent().build();

// PATCH 


GET       → 200 OK
POST      → 201 CREATED
PUT       → 200 OK
DELETE    → 204 NO CONTENT


What is the difference between ok and Status 🤔🤔🤔?
Factory Method of ResponseEntity



ResponseEntity
|
|
├── Shortcut Methods
│      ├── ok()          → 200
│      ├── noContent()   → 204
│      ├── badRequest()  → 400
│      └── notFound()    → 404
|
└── Generic Method
└── status()
|
├── 200
├── 201
├── 400
├── 404
└── Any Status

