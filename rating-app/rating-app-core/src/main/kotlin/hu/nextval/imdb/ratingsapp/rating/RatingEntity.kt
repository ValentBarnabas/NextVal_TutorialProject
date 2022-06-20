package hu.nextval.imdb.ratingsapp.rating

//@Entity
data class RatingEntity(
        var movieId: Long,
        var rating: Int,
//        var byUser : String,
//        @Id
//        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ratingGenerator")
//        @SequenceGenerator(name="ratingGenerator", sequenceName = "ratingSeq", allocationSize = 1)
        var id: Long
)