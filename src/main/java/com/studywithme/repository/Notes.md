| Method                 | Purpose                     |
| ---------------------- | --------------------------- |
| `save(entity)`         | Insert or update            |
| `saveAll(entities)`    | Insert/update multiple      |
| `findById(id)`         | Find one by Primary Key     |
| `findAll()`            | Get all records             |
| `findAllById(ids)`     | Get multiple records by IDs |
| `existsById(id)`       | Check whether ID exists     |
| `count()`              | Count records               |
| `deleteById(id)`       | Delete by ID                |
| `delete(entity)`       | Delete entity               |
| `deleteAll()`          | Delete all records          |
| `deleteAll(entities)`  | Delete multiple entities    |
| `flush()`              | Flush changes to DB         |
| `saveAndFlush(entity)` | Save + immediately flush    |
| `deleteAllInBatch()`   | Bulk delete                 |



JpaRepository<Student, Long>
│       │
│       └── Primary Key type = Long
└────────── Entity = Student


```
studentRepository.save(student);
studentRepository.findById(1L);
studentRepository.findAll();
studentRepository.existsById(1L);
studentRepository.count();
studentRepository.deleteById(1L);
```


The main design pattern involved is Proxy Pattern.