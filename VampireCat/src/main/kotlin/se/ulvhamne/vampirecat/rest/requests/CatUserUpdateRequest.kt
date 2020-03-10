package se.ulvhamne.vampirecat.rest.requests

class CatUserUpdateRequest(var username: String? = null,
                           var email: String? = null,
                           var mobile: String? = null,
                           var interests: List<String>? = null)
