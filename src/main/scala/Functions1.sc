import java.util.TimeZone



TimeZone.getAvailableIDs().map(countries => countries.split("/")).filter(filters => filters.size > 1).map(countries => countries.last).grouped(10).foreach(countries => println(countries.head) )

