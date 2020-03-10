package se.ulvhamne.vampirecat.data

import java.awt.Image
import java.util.*

class CatUser(val userId: UUID = UUID.randomUUID(),
              var username: String = "Placeholder",
              var email: String = "em@il",
              var mobile: String = "555 000 000",
              var location: String = "Hell",
              var interests: List<Interest> = emptyList(),
              var badges: List<Badge> = emptyList(),
              var images: List<Image> = emptyList()
)
