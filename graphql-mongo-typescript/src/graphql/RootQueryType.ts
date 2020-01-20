import { GraphQLList, GraphQLNonNull, GraphQLObjectType, GraphQLString } from "graphql";
import { IProductType } from "./types/IProductType";
import { IProduct } from '../models/IProduct';


export const RootQueryType = new GraphQLObjectType({
    name: "RootQueryType",
    fields: {
        GetDeals: {
            type: new GraphQLList(IProductType),
            resolve(obj, args, ctx) {
                const products: IProduct[] = [
                    {
                        _id: 1,
                        title: "Macbook pro",
                        category: "Computer",
                        price: 1200,
                        sku: "ssfff44",
                        ratings: 4,

                    },
                ];
                return products;
            },
        },
        GetDealById: {
            type: IProductType,
            args: {
                id: { type: new GraphQLNonNull(GraphQLString) },
            },
            resolve(obj, args, ctx) {
                return "single product";
            },
        },
    },
});
